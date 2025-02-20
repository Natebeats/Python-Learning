package day0602.kompositum;

import java.util.ArrayList;
import java.util.List;



class Kompositum implements Komponente {
    private List<Komponente> kinder = new ArrayList<>();
    String name; 
    public Kompositum(String name) {
    	this.name = name;
    	// TODO Auto-generated constructor stub
	}

	public void add(Komponente komponente) {
        kinder.add(komponente);
    }
    
    public void remove(Komponente komponente) {
        kinder.remove(komponente);
    }
    
    @Override
    public void operation() {
        System.out.println("Kompositum " + name + " enthält:");
        for (Komponente k : kinder) {
            System.out.print(name + "-" );
        	k.operation();
        }
    }
}
