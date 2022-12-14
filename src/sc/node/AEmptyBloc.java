/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class AEmptyBloc extends PBloc
{
    private TLAcc _lAcc_;
    private TRAcc _rAcc_;

    public AEmptyBloc()
    {
        // Constructor
    }

    public AEmptyBloc(
        @SuppressWarnings("hiding") TLAcc _lAcc_,
        @SuppressWarnings("hiding") TRAcc _rAcc_)
    {
        // Constructor
        setLAcc(_lAcc_);

        setRAcc(_rAcc_);

    }

    @Override
    public Object clone()
    {
        return new AEmptyBloc(
            cloneNode(this._lAcc_),
            cloneNode(this._rAcc_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAEmptyBloc(this);
    }

    public TLAcc getLAcc()
    {
        return this._lAcc_;
    }

    public void setLAcc(TLAcc node)
    {
        if(this._lAcc_ != null)
        {
            this._lAcc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lAcc_ = node;
    }

    public TRAcc getRAcc()
    {
        return this._rAcc_;
    }

    public void setRAcc(TRAcc node)
    {
        if(this._rAcc_ != null)
        {
            this._rAcc_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rAcc_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lAcc_)
            + toString(this._rAcc_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lAcc_ == child)
        {
            this._lAcc_ = null;
            return;
        }

        if(this._rAcc_ == child)
        {
            this._rAcc_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lAcc_ == oldChild)
        {
            setLAcc((TLAcc) newChild);
            return;
        }

        if(this._rAcc_ == oldChild)
        {
            setRAcc((TRAcc) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
