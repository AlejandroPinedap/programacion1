package co.edu.uniquindio.poo;

public record Estudiante(String nombre, String apellido, String identificacion, String correo, String telefono, byte edad) {

    public Estudiante {
        assert nombre !=null && !nombre.isBlank() : "El nombre debe de ser diferente a un dato nulo y un espacio vasio";
        assert apellido !=null && !apellido.isBlank() : "El apellido debe de ser diferente a un dato nulo y un espacio vacio";
        assert identificacion !=null && !identificacion.isBlank() : "La identificaion del estudiante no puede estar vacia y menos un dato nulo";
        assert correo !=null && !correo.isBlank() && correo.contains("@"): "El correo del estudiante debe de ser diferente a nulo, un espacio vacio y debe contener @";
        assert telefono !=null && !telefono.isBlank() : "El telefono del estudiante no puede ser un dato nulo y tampoco vacio";
        assert edad >=0;
    }

    
}
