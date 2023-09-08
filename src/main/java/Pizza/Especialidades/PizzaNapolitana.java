package Pizza.Especialidades;

import Pizza.Base.Topping;
import Pizza.Base.Pizza;
public class Napolitana extends Pizza{
    public Napolitana(String name) {
        super(name, new Topping("", 15));
    }

    // Sobrescribir el método prepare para imprimir un mensaje específico
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("Se ha agregado La Orilla de queso ala   Pizza .");
    }

}
