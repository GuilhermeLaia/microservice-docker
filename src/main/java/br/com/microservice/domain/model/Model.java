package br.com.microservice.domain.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MODEL")
public class Model implements Serializable {
	
	private static final long serialVersionUID = -5951125877939156847L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MODEL_SEQ")
    @SequenceGenerator(sequenceName = "SEQ_MODEL", allocationSize = 1, name = "MODEL_SEQ")
    @Column(name = "ID")
    private Long id;
    
    @Column(name = "DESCRIPTION")
    private String description;
    

    public Model(Long id) {
        this.id = id;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Model)) {
            return false;
        }
        Model other = (Model) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.microservice.domain.model.Model[ id=" + id + " ]";
    }
    
}
