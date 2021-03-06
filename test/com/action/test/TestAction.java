package com.action.test;



import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.web.servlet.ModelAndView;

public class TestAction extends ActionBaseTest {
	@Test    
    public void testAdd() throws Exception {    
    MockHttpServletRequest request = new MockHttpServletRequest();    
        MockHttpServletResponse response = new MockHttpServletResponse();    
        request.setRequestURI("/user/login");    
        request.addParameter("id", "1002");    
        request.addParameter("date", "2010-12-30");    
        request.setMethod("GET");    
        // 执行URI对应的action    
        final ModelAndView mav = this.excuteAction(request, response);    
        // Assert logic    
        Assert.assertEquals("user/login", mav.getViewName());    
        String msg=(String)request.getAttribute("msg");    
        System.out.println(msg);    
    }    

}
