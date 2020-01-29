
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public abstract class AbstractTask {
    private String id;
	private LocalDateTime createdAt;
	private LocalDateTime executedAt;

	public void setId(String id) {
		this.id = id;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public void setExecutedAt(LocalDateTime executedAt) {
		this.executedAt = executedAt;
	}
    @Override
	public String toString() {
		return getClass().getName()+ "\nId: " + this.id + "\ncreatedAt: " + this.createdAt + "\nexecutedAt: " + this.executedAt;
	}
}
