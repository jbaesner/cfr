package org.benf.cfr.reader.bytecode.analysis.types;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 13/07/2012
 * Time: 08:01
 */
public class JavaArrayTypeInstance implements JavaTypeInstance {
    private final int dimensions;
    private final JavaTypeInstance underlyingType;

    public JavaArrayTypeInstance(int dimensions, JavaTypeInstance underlyingType) {
        this.dimensions = dimensions;
        this.underlyingType = underlyingType;
    }

    @Override
    public StackType getStackType() {
        return StackType.REF;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(underlyingType);
        for (int x = 0; x < dimensions; ++x) {
            sb.append("[]");
        }
        return sb.toString();
    }
}