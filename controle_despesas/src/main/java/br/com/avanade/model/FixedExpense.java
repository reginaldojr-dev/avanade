package br.com.avanade.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@DiscriminatorValue("FIXED")
public class FixedExpense extends Expense {

    @NotBlank
    private String type;  // Water, Electricity, Internet
    @NotNull
    @NotBlank
    private LocalDate dueDate;

    public FixedExpense() {}

    public FixedExpense(String category, double amount, LocalDate date, String description, User user, String type, LocalDate dueDate) {
        super(category, amount, date, description, user);
        this.type = type;
        this.dueDate = dueDate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "FixedExpense{" +
                "type='" + type + '\'' +
                ", dueDate=" + dueDate +
                "} " + super.toString();
    }
}
