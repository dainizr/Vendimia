/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.Vendimia;

/**
 *
 * @author 52622
 */
public class Main {

    /**
     * Se instanció la venta y el artículo así como también el usuario que vende dicho artículo
     */
    public static void main(String[] args) {
    
        
       Venta venta = new Venta();
       
       Articulo articulo = new Articulo();
       
       articulo.setNombre("Cajón");
       articulo.setDescripcion("Cajón que se abre solo");
       articulo.setPrecio(1823.52);
       articulo.setUso(Uso.USADO);
       articulo.setCantidad(1);
       
      Usuario usuario = new Usuario();
      
      usuario.setNombre("Javier Gonzalez");
      usuario.setEmail("Javier_gonzales@gmail.com");
      usuario.setPassword("quesadilla123");
      
      venta.setArticulo(articulo);
      venta.setUsuario(usuario);
      
      
       System.out.println("Artículo por vender: "+venta.getArticulo().getNombre());
       System.out.println("Descripción del artículo:  "+venta.getArticulo().getDescripcion());
        System.out.println("Vendido por: "+venta.getUsuario().getNombre()+"("+venta.getUsuario().getEmail()+")");
        
        
    }

    
    
    

    
    
    
    
}
