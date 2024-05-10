package onezeze.diginom.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Tag(name = "Page Controller", description = "페이지 이동 컨트롤러")
@Controller
public class PageController {
    
    @GetMapping("/")
    @Operation(description = "paging to index.html")
    public String index(){
        return "index";
    }
}
