import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryMemberRepository extends JpaRepository<LibraryMember, Integer> {
    List<LibraryMember> findByName(String name);
}
