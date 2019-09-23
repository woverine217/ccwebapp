package Controller;





import DAO.UserDao;
import POJO.Register;
import POJO.User;
import POJO.baseInfo;
import POJO.error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

@Controller
public class CreateUser {
    @Autowired
    UserDao userDao;

    @RequestMapping(value="/v1/use",method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody <T> T CreatAccount(@RequestBody Register register){
        String content = register.getPassWord();
        String pattern = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";

        boolean isMatch = Pattern.matches(pattern, content);


        if(!isMatch) return (T) new error("please use Strong Password");
        User x = userDao.get(register.getEmail());
        if(x!=null) {

            return(T) new ResponseEntity<T>(HttpStatus.BAD_REQUEST);

        }else {
            User user = new User(register);
            baseInfo baseInfo = new baseInfo(register);
            Date dNow = new Date();
            SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            user.setAccountCreated(ft.format(dNow));
            userDao.register(user);
            return (T) baseInfo;
        }


    }
    @RequestMapping(value="/v1/user/self",method = RequestMethod.PUT,consumes = "application/json")
    public @ResponseBody String UpdateAccount(@RequestBody User user){
        
    }

}
