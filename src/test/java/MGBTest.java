

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mybatis.generator.api.GeneratedJavaFile;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MGBTest {
    public static void main(String[] args) throws Exception {
        generateJavaFiles("generatorConfig.xml");
    }
    
    @Test
    public void t() throws Exception {
        generateJavaFiles("generatorConfig.xml");
    }
    
    private static List<GeneratedJavaFile> generateJavaFiles(String configFile) throws Exception {
        List<String> warnings = new ArrayList<String>();
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(MGBTest.class.getResourceAsStream(configFile));
    
        DefaultShellCallback shellCallback = new DefaultShellCallback(true);
    
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, shellCallback, warnings);
        myBatisGenerator.generate(null, null, null, true);
        
        return myBatisGenerator.getGeneratedJavaFiles();
    }
}

