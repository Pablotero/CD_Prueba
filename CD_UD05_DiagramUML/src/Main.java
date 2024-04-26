public class Main {
    public static void main(String[] args) {

        //TODO: Crear los siguientes pasos para comprobar el funcionamiento del programa 
        // Crear una veterinaria
        // Crear dos clientes
        // Agregar clientes a la veterinaria
        // Crear dos animales

        // Agregar animales a la veterinaria
        //Crear un veterinario 
        // Crear una consulta

        // Asignar la consulta a un animal
        //Imprimir todas las consultas de los animales de la clínica 

        Veterinaria veterinaria = new Veterinaria();
        
        Cliente cliente1 = new Cliente("diego", "calle diego", "606068368");
        Cliente cliente2 = new Cliente("jose", "calle jose", "666666666");

        veterinaria.agregarCliente(cliente1);
        veterinaria.agregarCliente(cliente2);

        Animal animal1 = new Animal("perro", "perro", "perro", cliente1);
        Animal animal2 = new Animal("gato", "gato", "gato", cliente2);

        veterinaria.agregarAnimal(animal1);
        veterinaria.agregarAnimal(animal2);

        Veterinario veterinario1 = new Veterinario("Marcos", "perros");

        Consulta consulta1 = new Consulta("12/8/2024", "revision", "Todo bien", "nada", veterinario1);

        animal1.agregarConsulta(consulta1);

        veterinaria.imprimirConsultas();
    }

}