
package com.mycompany.werner;

import java.util.ArrayList;
public class MetodoAuto {
    
        ArrayList<Auto> Audi=new ArrayList<>();
    
    public void AgregarAutos(Auto autos){
        
        Audi.add(autos);
        System.out.println("AUTO AGREGADO CORRECTAMENTE ");
    }
    
    public ArrayList<Auto> ListaAutos(){
        return Audi;    
        
        
    }
    public void EliminarAutos(int selectRow){
        Audi.remove(selectRow);
        
        System.out.println("AUTO ELIMINADO");
    }
    public void ActualizarAuto(int  selectRow, Auto autos ){
        
        Audi.set(selectRow,autos);
            
        System.out.println("el auto que eligio fue actualizado correctamente");
    }
    
}
