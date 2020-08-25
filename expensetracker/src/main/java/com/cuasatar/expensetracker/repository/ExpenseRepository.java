package com.cuasatar.expensetracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cuasatar.expensetracker.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
