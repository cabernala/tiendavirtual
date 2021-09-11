package co.edu.unbosque.tiendavirtual.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import co.edu.unbosque.tiendavirtual.dao.UsuariosDAO;
import co.edu.unbosque.tiendavirtual.model.Usuarios;

public class usuariosAPI {
	
	@Autowired
	private UsuariosDAO usuarioDAO;
	
	@PostMapping("/guardar")
	public void guargar(@RequestBody Usuarios usuarios) {
		usuarioDAO.save(usuarios);
	}
	
	@GetMapping("/listar")
	public List<Usuarios> listar(){
		return usuarioDAO.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		usuarioDAO.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuarios) {
		usuarioDAO.save(usuarios);
	}

}
