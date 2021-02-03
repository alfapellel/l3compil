/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ARetInstr extends PInstr
{
    private PReturn _return_;
    private TSemicol _semicol_;

    public ARetInstr()
    {
        // Constructor
    }

    public ARetInstr(
        @SuppressWarnings("hiding") PReturn _return_,
        @SuppressWarnings("hiding") TSemicol _semicol_)
    {
        // Constructor
        setReturn(_return_);

        setSemicol(_semicol_);

    }

    @Override
    public Object clone()
    {
        return new ARetInstr(
            cloneNode(this._return_),
            cloneNode(this._semicol_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseARetInstr(this);
    }

    public PReturn getReturn()
    {
        return this._return_;
    }

    public void setReturn(PReturn node)
    {
        if(this._return_ != null)
        {
            this._return_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._return_ = node;
    }

    public TSemicol getSemicol()
    {
        return this._semicol_;
    }

    public void setSemicol(TSemicol node)
    {
        if(this._semicol_ != null)
        {
            this._semicol_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._semicol_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._return_)
            + toString(this._semicol_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._return_ == child)
        {
            this._return_ = null;
            return;
        }

        if(this._semicol_ == child)
        {
            this._semicol_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._return_ == oldChild)
        {
            setReturn((PReturn) newChild);
            return;
        }

        if(this._semicol_ == oldChild)
        {
            setSemicol((TSemicol) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
