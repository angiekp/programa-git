
package GramP.com.crud_spring_proyect.service;

import GramP.com.crud_spring_proyect.interfaceService.itSTipoGalpon;
import GramP.com.crud_spring_proyect.model.mTipoGalpon;
import GramP.com.crud_spring_proyect.vista.vTipoGalpon;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class sTipoGalpon implements itSTipoGalpon{
    
    @Autowired
    private vTipoGalpon vTG; 
    

    @Override
    public List<mTipoGalpon> listarTG() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<mTipoGalpon> listarIdTG(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int saveTG(mTipoGalpon mtG) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteTG(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
