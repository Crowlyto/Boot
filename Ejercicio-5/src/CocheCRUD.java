import java.util.List;

public interface CocheCRUD {
    void save(Coche coche);
    List<Coche> finAll();
    void delete(Coche coche);
}
