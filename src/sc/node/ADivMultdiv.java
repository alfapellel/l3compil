/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ADivMultdiv extends PMultdiv
{
    private PMultdiv _multdiv_;
    private TDiv _div_;
    private PNeg _neg_;

    public ADivMultdiv()
    {
        // Constructor
    }

    public ADivMultdiv(
        @SuppressWarnings("hiding") PMultdiv _multdiv_,
        @SuppressWarnings("hiding") TDiv _div_,
        @SuppressWarnings("hiding") PNeg _neg_)
    {
        // Constructor
        setMultdiv(_multdiv_);

        setDiv(_div_);

        setNeg(_neg_);

    }

    @Override
    public Object clone()
    {
        return new ADivMultdiv(
            cloneNode(this._multdiv_),
            cloneNode(this._div_),
            cloneNode(this._neg_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADivMultdiv(this);
    }

    public PMultdiv getMultdiv()
    {
        return this._multdiv_;
    }

    public void setMultdiv(PMultdiv node)
    {
        if(this._multdiv_ != null)
        {
            this._multdiv_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._multdiv_ = node;
    }

    public TDiv getDiv()
    {
        return this._div_;
    }

    public void setDiv(TDiv node)
    {
        if(this._div_ != null)
        {
            this._div_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._div_ = node;
    }

    public PNeg getNeg()
    {
        return this._neg_;
    }

    public void setNeg(PNeg node)
    {
        if(this._neg_ != null)
        {
            this._neg_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._neg_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._multdiv_)
            + toString(this._div_)
            + toString(this._neg_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._multdiv_ == child)
        {
            this._multdiv_ = null;
            return;
        }

        if(this._div_ == child)
        {
            this._div_ = null;
            return;
        }

        if(this._neg_ == child)
        {
            this._neg_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._multdiv_ == oldChild)
        {
            setMultdiv((PMultdiv) newChild);
            return;
        }

        if(this._div_ == oldChild)
        {
            setDiv((TDiv) newChild);
            return;
        }

        if(this._neg_ == oldChild)
        {
            setNeg((PNeg) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
