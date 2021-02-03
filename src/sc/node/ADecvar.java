/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ADecvar extends PDecvar
{
    private TType _type_;
    private TIdentif _identif_;

    public ADecvar()
    {
        // Constructor
    }

    public ADecvar(
        @SuppressWarnings("hiding") TType _type_,
        @SuppressWarnings("hiding") TIdentif _identif_)
    {
        // Constructor
        setType(_type_);

        setIdentif(_identif_);

    }

    @Override
    public Object clone()
    {
        return new ADecvar(
            cloneNode(this._type_),
            cloneNode(this._identif_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseADecvar(this);
    }

    public TType getType()
    {
        return this._type_;
    }

    public void setType(TType node)
    {
        if(this._type_ != null)
        {
            this._type_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._type_ = node;
    }

    public TIdentif getIdentif()
    {
        return this._identif_;
    }

    public void setIdentif(TIdentif node)
    {
        if(this._identif_ != null)
        {
            this._identif_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._identif_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._type_)
            + toString(this._identif_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._type_ == child)
        {
            this._type_ = null;
            return;
        }

        if(this._identif_ == child)
        {
            this._identif_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._type_ == oldChild)
        {
            setType((TType) newChild);
            return;
        }

        if(this._identif_ == oldChild)
        {
            setIdentif((TIdentif) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
