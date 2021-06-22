/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import atividade.pkg9.Funcionario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import atividade.pkg9.Funcionario;
import org.junit.Assert;
/**
 *
 * @author Jefferson
 */
public class FuncionarioTest {
    
    public void FuncionarioTest() {
        System.out.println("Inicio do teste");
        double Salario;
        Salario = Funcionario.calcularSalarioLiquido(1800);
        System.out.println("Salario");
        Assert.assertEquals(Salario, Funcionario.calcularSalarioLiquido(1800));
       
    
    }
    
    public void getSitucao(){
        
    }
    
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

}
