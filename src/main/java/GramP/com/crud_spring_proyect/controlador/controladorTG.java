
package GramP.com.crud_spring_proyect.controlador;

import GramP.com.crud_spring_proyect.interfaceService.itSGalpon;
import GramP.com.crud_spring_proyect.interfaceService.itSTipoGalpon;
import GramP.com.crud_spring_proyect.model.mGalpon;
import GramP.com.crud_spring_proyect.model.mTipoGalpon;

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
public class controladorTG {
   
    @Autowired
    private itSTipoGalpon service;
    
    @GetMapping("/listarTG")
   public String listarTG(Model model){
       List<mTipoGalpon> mTipoGalpones = service.listarTG();
       model.addAttribute("mTipoGalpon", mTipoGalpones);
       return"indexTG";
   }
   //Abre espacio en la base de datos
   @GetMapping("/newTG")
  public String agregarTG(Model model){
    model.addAttribute("mTipoGalpon", new mTipoGalpon());
    return "insertarTG";
    
  }
  @PostMapping("/saveTG")
  public String GuardarTG(mTipoGalpon mTG, Model model){
  service.saveTG(mTG);
  return "redirect:/listarTG";
  
  }
  @PostMapping("/eliminarTG/(id)")
  public String deleteTG(Model model, @PathVariable int id){
    service.deleteTG(id);
    return "redirec:/listarTG";
    
}
  @GetMapping("/editarTG/{id}")
  public String editarTG (@PathVariable int id, Model model) {
 Optional<mTipoGalpon> mTipoGalpones = service.listarIdTG(id);
 model.addAttribute("mTipoGalpon",mTipoGalpones);
 return "ingresarTG";
 }
