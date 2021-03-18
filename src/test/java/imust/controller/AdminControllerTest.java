package imust.controller;

import com.imust.MyApp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/** 
* AdminController Tester. 
* 
* @author <Authors name> 
* @since <pre>3�� 14, 2021</pre> 
* @version 1.0 
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApp.class)
public class AdminControllerTest {
    /**
     * 模拟mvc测试对象
     */
    private MockMvc mockMvc;

    /**
     * web项目上下文
     */
    @Autowired
    private WebApplicationContext webApplicationContext;

@Before
public void before() throws Exception {

    //获取mockmvc对象实例
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();

}
//
//@After
//public void after() throws Exception {
//}

/** 
* 
* Method: login(@ModelAttribute("admin") Admin admin, HttpSession session, Model model) 
* 
*/ 
@Test
public void testLogin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7
//    Assert.assertEquals("返回结果不一致", "/admin/index", responseString); // 8

//TODO: Test goes here... 
} 

/** 
* 
* Method: logout(HttpSession session) 
* 
*/ 
@Test
public void testLogout() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/logout") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7
//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllAdmin(Model model) 
* 
*/ 
@Test
public void testGetAllAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/admin-list") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: getByName(@RequestParam("nameTmp")String name, Model model) 
* 
*/ 
@Test
public void testGetByName() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/findAdminByName") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7



//TODO: Test goes here... 
} 

/** 
* 
* Method: addAdmin() 
* 
*/ 
@Test
public void testAddAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/admin") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: saveAdmin(@ModelAttribute("admin") Admin admin) 
* 
*/ 
@Test
public void testSaveAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: delAdmin(@RequestParam("adminId") int id) 
* 
*/ 
@Test
public void testDelAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: editAdmin(@RequestParam("adminId") int id, Model model) 
* 
*/ 
@Test
public void testEditAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: updateAdmin(Admin admin) 
* 
*/ 
@Test
public void testUpdateAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllCar(Model model) 
* 
*/ 
@Test
public void testGetAllCar() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: findCarByKey(@RequestParam("keyTmp")String key, Model model) 
* 
*/ 
@Test
public void testFindCarByKey() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: editCar(@RequestParam("carId") int id, Model model) 
* 
*/ 
@Test
public void testEditCar() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: saveMessage(@ModelAttribute("car") Park car) 
* 
*/ 
@Test
public void testSaveMessage() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: delCar(@RequestParam("carId") int id) 
* 
*/ 
@Test
public void testDelCar() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: addCar() 
* 
*/ 
@Test
public void testAddCar() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: carSave(@ModelAttribute("car") Park car) 
* 
*/ 
@Test
public void testCarSave() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllNotice(Model model) 
* 
*/ 
@Test
public void testGetAllNotice() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: findNoticeByTitle(@RequestParam("titleTmp")String title, Model model) 
* 
*/ 
@Test
public void testFindNoticeByTitle() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: addNotice() 
* 
*/ 
@Test
public void testAddNotice() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: saveNotice(HttpSession session, @ModelAttribute("notice") Notice notice) 
* 
*/ 
@Test
public void testSaveNotice() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: delNotce(@RequestParam("noticeId") int id) 
* 
*/ 
@Test
public void testDelNotce() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: editNotice(@RequestParam("noticeId") int id, Model model) 
* 
*/ 
@Test
public void testEditNotice() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: updateNotice(Notice notice) 
* 
*/ 
@Test
public void testUpdateNotice() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllOrder(Model model) 
* 
*/ 
@Test
public void testGetAllOrder() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: findOrderByKey(@RequestParam("keyTmp")String key, Model model) 
* 
*/ 
@Test
public void testFindOrderByKey() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: delOrder(@RequestParam("orderId") int id) 
* 
*/ 
@Test
public void testDelOrder() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllUserPoint(Model model) 
* 
*/ 
@Test
public void testGetAllUserPoint() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: findPointByName(@RequestParam("nameTmp")String name, Model model) 
* 
*/ 
@Test
public void testFindPointByName() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: findUserByName(@RequestParam("nameTmp")String name, Model model) 
* 
*/ 
@Test
public void testFindUserByName() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllUser(Model model) 
* 
*/ 
@Test
public void testGetAllUser() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: stopAdmin(@RequestParam("userId") int id) 
* 
*/ 
@Test
public void testStopAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: startAdmin(@RequestParam("userId") int id) 
* 
*/ 
@Test
public void testStartAdmin() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: getAllMessage(Model model) 
* 
*/ 
@Test
public void testGetAllMessage() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: findMessageByContent(@RequestParam("contentTmp")String content, Model model) 
* 
*/ 
@Test
public void testFindMessageByContent() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: delMessage(@RequestParam("messageId") int id) 
* 
*/ 
@Test
public void testDelMessage() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: addMessage(@RequestParam("messageId") int id, Model model) 
* 
*/ 
@Test
public void testAddMessage() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 

/** 
* 
* Method: answer(HttpSession session, @ModelAttribute("message") Message message) 
* 
*/ 
@Test
public void testAnswer() throws Exception {
    MvcResult mvcResult = mockMvc
            .perform(// 1
                    MockMvcRequestBuilders.get("/admin/login") // 2
                    //.param("name","getList")        // 3
            )
            .andReturn();// 4

    int status = mvcResult.getResponse().getStatus(); // 5
    String responseString = mvcResult.getResponse().getContentAsString(); // 6

    Assert.assertEquals("请求错误", 200, status); // 7

//TODO: Test goes here... 
} 


} 
