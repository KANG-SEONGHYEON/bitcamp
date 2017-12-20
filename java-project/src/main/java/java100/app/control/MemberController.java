package java100.app.control;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java100.app.annotation.RequestMapping;
import java100.app.annotation.RequestParam;
import java100.app.dao.MemberDao;
import java100.app.domain.Member;

@Controller
public class MemberController {
    
    @Autowired MemberDao memberDao;
    
    @RequestMapping("/member/list")
    public String list(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        List<Member> list = memberDao.selectList();
        
        request.setAttribute("list", list);
        
        return "/member/list.jsp";
    }
    
    @RequestMapping("/member/add")
    public String add(
            Member member,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        memberDao.insert(member);
        
        return "redirect:list.do";
    }
    
    @RequestMapping("/member/delete")
    public String delete(
            @RequestParam("no") int no,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {

        memberDao.delete(no); 
        return "redirect:list.do";
    }
    
    @RequestMapping("/member/form")
    public String form(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        return "/member/form.jsp";
    }
    
    @RequestMapping("/member/update")
    public String update(
            Member member,
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        memberDao.update(member);
        return "redirect:list.do";
    }
    
    @RequestMapping("/member/view")
    public String view(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        
        int no = Integer.parseInt(request.getParameter("no"));
        Member member = memberDao.selectOne(no);
        
        // 작업한 결과를 JSP에게 넘겨주기 위해 ServletRequest 보관소에 저장한다.
        request.setAttribute("member", member);
        
        return "/member/view.jsp";
    }
    
}
