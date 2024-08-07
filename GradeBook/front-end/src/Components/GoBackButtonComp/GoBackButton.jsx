import React from "react";
import { Navigate, useNavigate } from "react-router-dom";
import './GoBackButton.css';

function GoBackButton({path}){
    const navigate = useNavigate();

    const handleClick = () => {
        navigate(path);
    }

    return(
        <div className="button-container">
            <button className="back-button" onClick={handleClick}>
                <img src="src\assets\goBackArrow.png" alt="Button Image"/>
            </button>  
        </div>
    );

}

export default GoBackButton;