package fleetmsv2.security.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "role")
public class Role extends Auditable<String> {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;

	private String description;
	private String details;

	@Column(name = "name")
	private String name;
}
