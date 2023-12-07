
package GramP.com.crud_spring_proyect.service;

import GramP.com.crud_spring_proyect.interfaceService.itSGalpon;
import GramP.com.crud_spring_proyect.model.mGalpon;
import GramP.com.crud_spring_proyect.vista.vGalpon;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class sGalpon implements itSGalpon{
    
    @Autowired
    private vGalpon vG; 
    
    @Override
    public List<mGalpon> listar() {
        return(List<mGalpon>)vG.findAll();
    }

    @Override
    public Optional<mGalpon> listarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int save(mGalpon mG) {
        int res=0;
        mGalpon mGalpo=vG.save(mG);
        if(!mGalpo.equals(null)){
           res=1; 
        }
        return res;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
