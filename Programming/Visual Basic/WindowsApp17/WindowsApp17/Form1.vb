Public Class Form1
    Private Sub clockTimer_Tick(sender As System.Object,
      e As System.EventArgs) Handles clockTimer.Tick
        CurrentTimeLabel.Text = String.Format("{0:hh:mm:ss tt}",
         Date.Now)

    End Sub

    Private Sub ShippingTimeForm_Load(sender As System.Object,
      e As System.EventArgs) Handles MyBase.Load
        Dim currentTime As Date = Date.Now
        dropOffDateTimePicker.MinDate = New Date(currentTime.Year,
           currentTime.Month, currentTime.Day, 0, 0, 0)
        dropOffDateTimePicker.MaxDate =
           dropOffDateTimePicker.MinDate.AddDays(1)

        DisplayDeliveryTime()
    End Sub

    Private Sub dropOffDateTimePicker_ValueChanged(
       sender As System.Object, e As System.EventArgs) _
       Handles dropOffDateTimePicker.ValueChanged
        DisplayDeliveryTime()
    End Sub


    Sub DisplayDeliveryTime()
        Dim delivery As Date = DepartureTime()
        delivery = delivery.AddHours(3)
        lasvegasTimeLabel.Text = delivery.ToLongDateString &
           " at " & delivery.ToShortTimeString
    End Sub


    Function DepartureTime() As Date
        Dim currentDate As Date = Date.Now
        Dim departTime As Date
        Select Case dropOffDateTimePicker.Value.Hour
            Case 0 To 10
                departTime = New Date(currentDate.Year,
                   currentDate.Month, currentDate.Day, 12, 0, 0)
            Case 23
                currentDate = currentDate.AddDays(1)
                departTime = New Date(currentDate.Year,
                   currentDate.Month, currentDate.Day, 12, 0, 0)
            Case Else
                currentDate = currentDate.AddDays(1)
                departTime = New Date(currentDate.Year,
                   currentDate.Month, currentDate.Day, 0, 0, 0)
        End Select

        Return departTime
    End Function
End Class

