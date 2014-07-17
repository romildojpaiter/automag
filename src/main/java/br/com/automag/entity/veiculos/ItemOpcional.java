package br.com.automag.entity.veiculos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import org.hibernate.annotations.Where;

import br.com.paiter.core.entity.BasePersistEntity;

@Data
@EqualsAndHashCode(of={"id"}, callSuper=false)
@NoArgsConstructor
@Entity
@Where(clause = "removido = 'NAO'")
@SequenceGenerator(name="item_opcional_seq",sequenceName="item_opcional_seq",allocationSize=1)
public class ItemOpcional extends BasePersistEntity{

	@Id
	@GeneratedValue(generator="item_opcional_seq", strategy=GenerationType.SEQUENCE)
	private Long id;

	@NotNull
	private String nome;

}
