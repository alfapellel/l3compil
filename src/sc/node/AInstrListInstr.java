/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AInstrListInstr extends PListInstr
{
    private PInstr _instr_;

    public AInstrListInstr()
    {
        // Constructor
    }

    public AInstrListInstr(
        @SuppressWarnings("hiding") PInstr _instr_)
    {
        // Constructor
        setInstr(_instr_);

    }

    @Override
    public Object clone()
    {
        return new AInstrListInstr(
            cloneNode(this._instr_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAInstrListInstr(this);
    }

    public PInstr getInstr()
    {
        return this._instr_;
    }

    public void setInstr(PInstr node)
    {
        if(this._instr_ != null)
        {
            this._instr_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._instr_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._instr_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._instr_ == child)
        {
            this._instr_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._instr_ == oldChild)
        {
            setInstr((PInstr) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
