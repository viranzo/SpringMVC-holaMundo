/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holaMundo.presentacion;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Vicente
 */
@Controller
public class RootControler {
    
    @RequestMapping({"/index.html"})
    public ModelAndView newForm(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> model = new HashMap<String, Object>();
        String viewName;
        
            model.put("message", "Contenido del mensaje");
            viewName = "holaMundo";

        return new ModelAndView(viewName, model);
    }
}
