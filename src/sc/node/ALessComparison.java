/* This file was generated by SableCC (http://www.sablecc.org/). */

package sc.node;

import sc.analysis.*;

@SuppressWarnings("nls")
public final class ALessComparison extends PComparison
{
    private PComparison _comparison_;
    private TLess _less_;
    private PAdsous _adsous_;

    public ALessComparison()
    {
        // Constructor
    }

    public ALessComparison(
        @SuppressWarnings("hiding") PComparison _comparison_,
        @SuppressWarnings("hiding") TLess _less_,
        @SuppressWarnings("hiding") PAdsous _adsous_)
    {
        // Constructor
        setComparison(_comparison_);

        setLess(_less_);

        setAdsous(_adsous_);

    }

    @Override
    public Object clone()
    {
        return new ALessComparison(
            cloneNode(this._comparison_),
            cloneNode(this._less_),
            cloneNode(this._adsous_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseALessComparison(this);
    }

    public PComparison getComparison()
    {
        return this._comparison_;
    }

    public void setComparison(PComparison node)
    {
        if(this._comparison_ != null)
        {
            this._comparison_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._comparison_ = node;
    }

    public TLess getLess()
    {
        return this._less_;
    }

    public void setLess(TLess node)
    {
        if(this._less_ != null)
        {
            this._less_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._less_ = node;
    }

    public PAdsous getAdsous()
    {
        return this._adsous_;
    }

    public void setAdsous(PAdsous node)
    {
        if(this._adsous_ != null)
        {
            this._adsous_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._adsous_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._comparison_)
            + toString(this._less_)
            + toString(this._adsous_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._comparison_ == child)
        {
            this._comparison_ = null;
            return;
        }

        if(this._less_ == child)
        {
            this._less_ = null;
            return;
        }

        if(this._adsous_ == child)
        {
            this._adsous_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._comparison_ == oldChild)
        {
            setComparison((PComparison) newChild);
            return;
        }

        if(this._less_ == oldChild)
        {
            setLess((TLess) newChild);
            return;
        }

        if(this._adsous_ == oldChild)
        {
            setAdsous((PAdsous) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
