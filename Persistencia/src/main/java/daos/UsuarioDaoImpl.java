
package daos;

import entidades.UsuarioEntity;
import java.util.List;
import java.util.Optional;
import javax.persistence.*;

public class UsuarioDaoImpl implements IDao<UsuarioEntity> {

    private EntityManagerFactory emf;
    private EntityManager em;

    public UsuarioDaoImpl() {
        this.emf = Persistence.createEntityManagerFactory("default");
        this.em = emf.createEntityManager();
    }

    @Override
    public void crear(UsuarioEntity entidad) {
        em.getTransaction().begin();
        em.persist(entidad);
        em.getTransaction().commit();
        System.out.println("Se ha agregado el usuario a la base de datos exitosamente.");
    }

    @Override
    public Optional<UsuarioEntity> obtenerPorId(long id) {
        UsuarioEntity usuario = em.find(UsuarioEntity.class, id);
        return usuario != null ? Optional.of(usuario) : Optional.empty();
    }

    @Override
    public List<UsuarioEntity> obtenerTodos() {
        return em.createQuery("SELECT u FROM UsuarioEntity u", UsuarioEntity.class).getResultList();
    }

    @Override
    public void actualizar(UsuarioEntity entidad) {
        em.getTransaction().begin();
        em.merge(entidad);
        em.getTransaction().commit();
    }

    @Override
    public void eliminar(long id) {
        em.getTransaction().begin();
        UsuarioEntity usuario = em.find(UsuarioEntity.class, id);
        if (usuario != null) {
            em.remove(usuario);
        }
        em.getTransaction().commit();
    }
}
    

