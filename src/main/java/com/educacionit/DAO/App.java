package com.educacionit.DAO;

import com.educacionit.entidades.Usuario;
import com.educacionit.implementacion.mysql.UsuarioImplementacion;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Usuario usuario = null;
    	UsuarioImplementacion impl = new UsuarioImplementacion();
    	
    	usuario = impl.buscar("user1@gmail.com");
    	System.out.println(usuario);
    	
    	
    	
    	
    }
}