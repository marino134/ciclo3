public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("CAMELLO", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("VACA", "Mamifero");
        miVertebrados[2] = new Vertebrado("TIBURON", "Pez"); 
        
        return miVertebrados;
    }
}
