package mvc.servlet.web.springmvc.v3;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mvc.servlet.domain.member.Member;
import mvc.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/springmvc/v3/members")
public class SpringMemberControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

    @GetMapping("/new-form")
    public String  newForm() {
        return "new-form";
    }

    @PostMapping("/save")
    public String save(Model model) {
        List<Member> members = memberRepository.findAll();
        model.addAttribute("member", members);
        return "members";
    }

    @GetMapping
    public String members(@RequestParam String username, @RequestParam int age, Model model) {

        Member member = new Member(username, age);
        model.addAttribute("members", memberRepository.save(member));
        return "save-result";
    }
}
