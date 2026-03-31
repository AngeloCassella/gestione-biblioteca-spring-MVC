package org.example.gestioneBiblioteca.services;

import org.example.gestioneBiblioteca.models.Book;
import org.example.gestioneBiblioteca.models.Loan;
import org.example.gestioneBiblioteca.models.User;

import java.util.List;

public interface LoanService {

    public Loan createLoan(User utente, Book libro);
    public void closeLoan(Loan loan);
    public List<Loan> activeLoans();
    public void saveLoan(Loan loan);
    public Loan findLoan(long id);
    public List<Loan> findAll();
    public void deleteLoan(Loan loan);
    public void deleteById(long id);

}
