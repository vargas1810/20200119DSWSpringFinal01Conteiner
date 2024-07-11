    package sm.dsw.ms.usuario.repository;

import java.util.List;
import sm.dsw.ms.usuario.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    @Query("SELECT u FROM Usuario u WHERE u.rol.nombre = :nombreRol")
    List<Usuario> findByRolNombre(@Param("nombreRol") String nombreRol);

}
