package org.benf.cfr.reader.bytecode.analysis.structured.statement;

import org.benf.cfr.reader.bytecode.analysis.parse.expression.MemberFunctionInvokation;
import org.benf.cfr.reader.util.output.Dumper;

/**
 * Created:
 * User: lee
 * Date: 15/05/2012
 */
public class StructuredConstruction extends AbstractStructuredStatement {
    private MemberFunctionInvokation invokation;

    public StructuredConstruction(MemberFunctionInvokation invokation) {
        this.invokation = invokation;
    }

    @Override
    public void dump(Dumper dumper) {
        dumper.print(invokation.toString() + "; // <-- constructor of (" + invokation.getObject() + ")\n");
    }
}