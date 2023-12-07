
package GramP.com.crud_spring_proyect.interfaceService;

import GramP.com.crud_spring_proyect.model.mTipoGalpon;
import java.util.List;
import java.util.Optional;

public interface itSTipoGalpon {
    public List<mTipoGalpon>listarTG();
    
    public Optional<mTipoGalpon>listarIdTG( int id);
    
    public int saveTG(mTipoGalpon mtG);
    
    public void deleteTG(int id);            
}
