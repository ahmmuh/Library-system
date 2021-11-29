///*
//
//
//package com.example.librarysystem.controllers;
//
//import com.example.librarysystem.models.User;
//import com.example.librarysystem.security.CorsConfig;
//import com.example.librarysystem.service.UserService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/users/")
//public class UserController {
//
//    private final UserService userService;
//    public UserController(CorsConfig config, UserService userService) {
//        this.userService = userService;
//    }
//
//    @RequestMapping("/")
//    public ModelAndView homePage(){
//        return new ModelAndView("index");
//    }
//
//
//    @RequestMapping("/user")
//    public ModelAndView userPage(Model model){
//        List<User> users = userService.getALlUsers();
//        model.addAttribute("users",users);
//        return new ModelAndView("user");
//    }
//
//    @RequestMapping("/manager")
//    public ModelAndView managerPage(){
//        return new ModelAndView("manager");
//    }
//
//
//    @RequestMapping("/admin")
//    public ModelAndView adminPage(){
//        return new ModelAndView("admin");
//    }
//
//    @RequestMapping("/register")
//    public ModelAndView signUp(){
//        return new ModelAndView("register");
//    }
//
//   @RequestMapping(value = "",method = RequestMethod.GET)
//    public ModelAndView signUp(Model model){
//        User user = new User();
//        model.addAttribute("user",user);
//        return new ModelAndView("register");
//    }
//
//
//    @GetMapping("/register")
//    public String showRegisterForm(Model model){
//        User user = new User();
//        model.addAttribute("user",user);
//        return "signup";
//    }
//    @PostMapping("/register")
//    public String addUser(@ModelAttribute("user") User user) {
//        User newUser = userService.addUser(user);
//        return ("user");
//    }
//
//   public String createUser(Model model, @ModelAttribute User userInfo) {
//        User user = userService.addUser(userInfo);
//        return "redirect:/users/";
//    }
//    @GetMapping("/users/api/all")
//    public ResponseEntity<List<User>> getAllUsers(){
//        List<User> users = userService.getALlUsers();
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }
//
//  @GetMapping("/")
//    public String index(Model model){
//        List<User> users = userService.getALlUsers();
//        model.addAttribute("users",users);
//        return "ok 1";
//    }
//
//
//
//
//    @GetMapping("/user/{id}")
//public ResponseEntity<User> getUserById(@PathVariable("id") Long id){
//        User user = userService.getUser(id);
//        return new ResponseEntity<>(user,HttpStatus.OK);
//}
//
// @PutMapping("/user/update")
//public ResponseEntity<User>  updateUser(@RequestBody User user){
//        User updatedUser = userService.updateUser(user);
//        return new ResponseEntity<>(updatedUser,HttpStatus.OK);
//    }
//
//
// @RequestMapping(value = "/",method = RequestMethod.POST)
//    public ResponseEntity<User> addUser( Model model, @ModelAttribute User userInfo ){
//
//        User newUser = userService.addUser(userInfo);
//       return new ResponseEntity<>(newUser, HttpStatus.CREATED);
//    }
//
//
//}
//
//
//*/
