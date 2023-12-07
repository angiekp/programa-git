
package GramP.com.crud_spring_proyect.interfaceService;

import GramP.com.crud_spring_proyect.model.mGalpon;
import java.util.List;
import java.util.Optional;

public interface itSGalpon {
    public List<mGalpon>listar();
    public Optional<mGalpon>listarId( int id);
    
    public int save(mGalpon mG);
    public void delete(int id);            
}
