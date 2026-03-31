package org.example.gestioneBiblioteca.repositories;

import org.example.gestioneBiblioteca.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
