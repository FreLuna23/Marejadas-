
package marejadas;


public class AnalisisMarejadas {
    private List<DatoOceano> datos;
    
    public AnalisisMarejadas(List<Dato> lista){
        this.datos = new ArrayList();
        for (Dato d: lista){
            if(d instanceof DatoOceano){
                this.datos.add((DatoOCeano) d);
                
            }
        }
    }
    public void olaMasAlta(){
        if(dato.isEmpty()) return;
        
        DatoOceano max = datos.get(0);
        for (DatoOceano d : datos){
            id(d.gethm0() > max.getHm0()){
                max = d;
            }     
       
        }
        System.out.println("\n ola mas alta registrada");
        max.mostrar();
    }
}
