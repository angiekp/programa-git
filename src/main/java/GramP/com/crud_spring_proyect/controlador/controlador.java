
package GramP.com.crud_spring_proyect.controlador;

import GramP.com.crud_spring_proyect.interfaceService.itSGalpon;
import GramP.com.crud_spring_proyect.model.mGalpon;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class controlador {
   
    @Autowired
    private itSGalpon service;
    
    @GetMapping("/listar")
   public String listar(Model model){
       List<mGalpon>mGalpones= service.listar();
       model.addAttribute("mGalpones", mGalpones);
       return"indexTG";
   }
   //Abre espacio en la base de datos
   @GetMapping("/new")
  public String agregar(Model model){
    model.addAttribute("mGalpon", new mGalpon());
    return "insertar";
    
  }
  @PostMapping("/save")
  public String Guardar(mGalpon mG, Model model){
  service.save(mG);
  return "redirect:/listar";
  
  }
  @PostMapping("/eliminar/(id)")
  public String delete(Model model, @PathVariable int id){
    service.delete(id);
    return "redirec:/listar";
  }
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model) {
      Optional<mGalpon> mGalpones = service.listarId(id);
      model.addAttribute("mGalpon",mGalpones);
      return "ingresar";
  }
}
