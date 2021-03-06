package main;

import org.apache.jmeter.engine.util.CompoundVariable;
import org.apache.jmeter.functions.AbstractFunction;
import org.apache.jmeter.functions.InvalidVariableException;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.samplers.Sampler;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Sha256 extends AbstractFunction {
    // 自定义function的描述
    private static final List<String> desc = new LinkedList<String>();
    static {
        desc.add("随机数");
    }

    // function名称
    private static final String KEY = "__Sha256";

    private static final int MAX_PARA_COUNT = 1;
    private static final int MIN_PARA_COUNT = 1;

    // 传入参数的值
    private Object[] values;

    private Random r = new Random();

//        @Override
    public List<String> getArgumentDesc() {
        return desc;
    }

    @Override
    public String execute(SampleResult previousResult, Sampler currentSampler) throws InvalidVariableException {
        try {
            int max = new Integer(((CompoundVariable) values[0]).execute().trim());
            int val = r.nextInt(max);
            return String.valueOf(val);
        } catch (Exception ex) {
            throw new InvalidVariableException(ex);
        }
    }

    @Override
    public String getReferenceKey() {
        return KEY;
    }

    @Override
    public void setParameters(Collection<CompoundVariable> parameters) throws InvalidVariableException {
        checkParameterCount(parameters, MIN_PARA_COUNT, MAX_PARA_COUNT); // 检查参数的个数是否正确
        values = parameters.toArray(); // 将值存入类变量中。
    }

}
