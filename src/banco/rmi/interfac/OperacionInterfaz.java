package banco.rmi.interfac;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface OperacionInterfaz extends Remote {
	public void registrarCliente(String cedula, String nombre) throws RemoteException;
	public void listarClientes() throws RemoteException;
	public void eliminarCliente(String cedula) throws RemoteException;
	
	public void agregarTransaccion(String cedula_cliente, int tipo, int cantidad) throws RemoteException;
	public void listarTransacciones(String cedula_cliente) throws RemoteException;
}
