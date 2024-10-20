package net.codejava.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Emplyee")
public class EmplyeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	@Column
	private String firstName;

	@Column
	private String lastName;

	@Column
	private String gmail;

}
