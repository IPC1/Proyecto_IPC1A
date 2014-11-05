package Clientes;

import java.util.Date;

import javax.swing.JOptionPane;

import ReservacionHabitaciones.Nodo;

public class ListaCliente {
	NodoClientes inicio, fin;
	ListaCliente(){
		inicio=null;
		fin=null;
	}
	
	public void insertar(String nombre, String direccion, int nit,int DPI,String referencia){
		NodoClientes nuevo= new NodoClientes (nombre,direccion,nit,DPI,referencia,inicio);
		inicio= nuevo;
		if (fin==null)
			fin=inicio;
		 JOptionPane.showMessageDialog(null,"Se ha agregado un nuevo cliente");
		}
	public void eliminarCliente( int nit){
		NodoClientes temp=inicio;
		int cont=1;
		 while (nit!= temp.getNit()){
			 temp=temp.siguiente;
			 cont++;
		 }
		 JOptionPane.showMessageDialog(null,"Se ha eliminado al cliente:" + temp.getNombre());
		 if (cont==1){
			 inicio=temp.siguiente;
		 }else{
			 temp=inicio;
			 for (int i =1; i<cont-1; i++){
				temp=temp.siguiente; 
			 }
			 temp.setSiguiente(temp.siguiente.siguiente);
		 }
		if (temp.siguiente==null){
			fin=temp;
		}
		if (temp==null){
			JOptionPane.showMessageDialog(null,"Se han encontrado coincidencias");
		}
	}
	public void Buscar(int nit){
		NodoClientes temp =inicio;
		while (temp!=null){
			if (nit== temp.getNit()){
				JOptionPane.showMessageDialog(null,"Se ha encontrado al  cliente: "+temp.getNombre());
				break;
				}
			temp=temp.siguiente;
			}
		if (temp==null){
			JOptionPane.showMessageDialog(null,"No se ha encontrado ningun cliente con el NIT: "+nit);
		}
		}
	public void Obtener(int nit){
		String nl = System.getProperty("line.separator");
		NodoClientes temp= inicio;
		while (temp!=null){
			if (nit== temp.getNit()){
				JOptionPane.showMessageDialog(null,"Nombre: "+temp.getNombre()+
						nl+"NIT: "+temp.getNit()+
						nl+"DPI: "+temp.getDPI()+
						nl+"Dirección: "+temp.getDireccion()+
						nl+"Referencia: "+temp.getTelefono());	
			}
			temp=temp.siguiente;
			}
			
	}
	public String ObtenerString(int nit){
		String nl = System.getProperty("line.separator");
		String texto=" ";
		NodoClientes temp= inicio;
		while (temp!=null){
			if (nit== temp.getNit()){
				texto="Nombre: "+temp.getNombre()+
						nl+"NIT: "+temp.getNit()+
						nl+"DPI: "+temp.getDPI()+
						nl+"Dirección: "+temp.getDireccion()+
						nl+"Referencia: "+temp.getTelefono();	
			}
			temp=temp.siguiente;
			}
		return texto;	
	}
}
