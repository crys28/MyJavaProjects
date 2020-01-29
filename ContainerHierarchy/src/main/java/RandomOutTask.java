
import java.time.LocalDateTime;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crys_
 */
public class RandomOutTask extends AbstractTask implements Task  {
    private double rand;
	public RandomOutTask() {
		this.rand = Math.random() * 10;
		super.setCreatedAt(LocalDateTime.now());
		super.setId(UUID.randomUUID().toString());
	}
    @Override
	public void execute() {
		System.out.println(this.rand);
		super.setExecutedAt(LocalDateTime.now());
	}
}
