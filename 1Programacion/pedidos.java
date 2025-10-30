package actividad1;

public class pedidos {
    public static void main(String[] args) {
        String nombre = "Raton logitech"; 
        System.out.println("Nombre: " + nombre);

        int cantidad = 10;
        System.out.println("Cantidad: " + cantidad);

        double precio = 34.99;
        System.out.println("Precio: " + precio);
        
        String categoría = "Electronico";
        System.out.println("Categoría: " + categoría);

        boolean disponible = true;
        System.out.println("Disponible: " + disponible);

        double total = cantidad * precio;
        System.out.println("Total: €" + total);

        double saldo = 500;
        System.out.println("Saldo: " + saldo);

        double descuento = 0.15;
        double MinimoDescuento = 300;

        if (total > MinimoDescuento) {
            descuento = total * descuento;
            total -= descuento;
            System.out.println("Descuento Aplicado: €" + descuento);
        } else {
            System.out.println("Descuento no aplicado");
        }

        if (saldo >= total) {
            System.out.println("Compra realizada");
        } else {
            System.out.println("Compra no realizada");
        }
        }
    }